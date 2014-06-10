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

For auto builds

```shell
lein cljsbuild auto
```

And for dev server, in another shell

```shell
lein repl
```

and inside the REPL

```clojure
(run)
```

Copyright
---------

MIT. See MIT-LICENSE.md for further details.
