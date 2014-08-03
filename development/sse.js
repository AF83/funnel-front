var http = require('http');
var sys = require('sys');
var fs = require('fs');

var PORT = 4000;

function debugHeaders(req) {
  console.log('URL: ' + req.url);
  for (var key in req.headers) {
    console.log(key + ': ' + req.headers[key]);
  }
  console.log('\n\n');
}

function createData() {
  return {
    time: (new Date()).toLocaleTimeString(),
    queries: [
      {type: "github"},
      {type: "trello"}
    ]
  };
}

function constructSSE(res, id, data) {
  var idText = 'id: ' + id + '\n',
      dataText = "data: " + JSON.stringify(createData()) + '\n\n';

  console.log(idText + dataText);

  res.write(idText);
  res.write(dataText);
}

function sendSSE(req, res) {
  res.writeHead(200, {
    'Content-Type': 'text/event-stream',
    'Cache-Control': 'no-cache',
    'Connection': 'keep-alive'
  });

  var id = Date.now();

  setInterval(function() {
    constructSSE(res, id, createData());
  }, 1000);

  constructSSE(res, id, createData());
}

http.createServer(function(req, res) {
  debugHeaders(req);

  if (req.headers.accept &&
      req.headers.accept == 'text/event-stream' &&
      req.url.match(/river/))
  {
    sendSSE(req, res);
  } else {
    res.writeHead(404);
    res.end();
  }

}).listen(PORT);

console.log("started listening on port " + PORT);
