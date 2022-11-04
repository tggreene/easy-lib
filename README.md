# easy-lib

A small template for libraries using applied-science/deps-library

## Usage

FIXME: write usage documentation!

Creating a project from this template (the `:new` alias in this template project defaults `:template` to easy-lib):

```bash
    clojure -X:new create :name myname/myproject
    cd myproject
```

Build a deployable jar of this template:

    $ clojure -X:jar

Install it locally:

    $ clojure -M:install

Deploy it to Clojars -- needs `CLOJARS_USERNAME` and `CLOJARS_PASSWORD` environment variables:

    $ clojure -M:deploy

## License

Copyright © 2022 Tim

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
