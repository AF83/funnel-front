funnel-front
============

A front end for [Funnel](https://github.com/AF83/funnel) with
[om](https://github.com/swannodette/om)
on a [FLUX](http://facebook.github.io/react/docs/flux-overview.html)
architecture.

Installation
------------

Use the tools provided in [Louis de Funnel](https://github.com/af83/LouisDeFunnel).
[funnel http](https://github.com/af83/funnel_http) is required to run this front.
All assets are served statically (see nginx conf of funnel http)

Node.js and bower must be installed.

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

Copyright
---------

MIT. See MIT-LICENSE.md for further details.
