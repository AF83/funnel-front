funnel-front
============

A front end for [Funnel](https://github.com/AF83/funnel) with
[om](https://github.com/swannodette/om)
on a [FLUX](http://facebook.github.io/react/docs/flux-overview.html)
architecture.

Installation
------------

Node.js and bower must be installed

```shell
npm install -g bower
```

[Leiningen](http://leiningen.org/) also.

Then

```shell
lein bower install
```


Development
-----------

For clojurescript auto builds

```shell
lein cljsbuild auto
```

For SASS auto builds, in another shell

```shell
lein sass auto
```

SASS files go to `src/sass` folder

And for dev server, in another shell

```shell
lein repl
```

and inside the REPL

```clojure
(run)
```

### Event Source

Edit `/etc/hosts` and add

```
127.0.0.1	funnel-front.local
```

Add `development/conf-nginx` to your Nginx

Finally launch the Node.js server

```shell
cd development
node sse.js
```

This is a temporary Node.js dependency for development purpose.
It will soon be removed.

Copyright
---------

MIT. See MIT-LICENSE.md for further details.
