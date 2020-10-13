## Example Clojurescript / Reagent use of React Beautiful Drag and Drop

Demonstrates a clojurescript implementation of a Simple List with React Drag and Drop.

Pretty much a direct translation of the [JS/React Simple List Example](https://codesandbox.io/s/k260nyxq9v)

This first pass is mainly to get something to work in Clojurescript.
It is not (yet) implemented in a more Clojurescript style but mostly a literal
translation of the javascript into Clojurescript.

The example runs inside a Devcard.


## Available Scripts

In the project directory, you can run:

### `yarn cards`

Runs the interactive live development enviroment.<br>

This environment uses [Devcards](https://github.com/bhauman/devcards)

### `yarn lint` and `yarn format`

`yarn lint` checks the code for known bad code patterns using [clj-kondo](https://github.com/borkdude/clj-kondo).

`yarn format` will format your code in a consistent manner using [zprint-clj](https://github.com/clj-commons/zprint-clj).

### `yarn report`

Make a report of what files contribute to your app size.<br>
Consider [code-splitting](https://code.thheller.com/blog/shadow-cljs/2019/03/03/code-splitting-clojurescript.html) or using smaller libraries to make your app load faster.

### `yarn server`

Starts a Shadow CLJS background server.<br>
This will speed up starting time for other commands that use Shadow CLJS.

This project was bootstrapped with [Create CLJS App](https://github.com/filipesilva/create-cljs-app).
