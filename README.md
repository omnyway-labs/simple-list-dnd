## Example Clojurescript / Reagent use of React Beautiful Drag and Drop

Demonstrates a clojurescript implementation of a Simple List with [react-beautiful-dnd](https://github.com/atlassian/react-beautiful-dnd).

Pretty much a direct translation of the [JS/React Simple List Example](https://codesandbox.io/s/k260nyxq9v)

This first pass is mainly to get something to work in Clojurescript.
It is not (yet) implemented in a more Clojurescript style but mostly a literal
translation of the Javascript into Clojurescript.

The example runs inside a Devcard or standalone.


## Available Scripts

In the project directory, you can run:

### `yarn cards`

Runs the interactive live development enviroment.<br>

This environment uses [Devcards](https://github.com/bhauman/devcards)

### `yarn start`

Runs the app in development mode.<br>
Pretty much just the DND component right now, but without devcards

Open [http://localhost:3000](http://localhost:3000) to view it in the browser.
The page will reload if you make edits.

### `yarn lint` and `yarn format`

`yarn lint` checks the code for known bad code patterns using [clj-kondo](https://github.com/borkdude/clj-kondo).

`yarn format` will format your code in a consistent manner using [zprint-clj](https://github.com/clj-commons/zprint-clj).

### `yarn report`

Make a report of what files contribute to your app size.<br>
Consider [code-splitting](https://code.thheller.com/blog/shadow-cljs/2019/03/03/code-splitting-clojurescript.html) or using smaller libraries to make your app load faster.

### `yarn server`

Starts a Shadow CLJS background server.<br>
This will speed up starting time for other commands that use Shadow CLJS.

## General info

This project was bootstrapped with [Create CLJS App](https://github.com/filipesilva/create-cljs-app).

The app uses [Reagent](https://reagent-project.github.io), a minimalistic interface between ClojureScript and React.<br>
You can use existing npm React components directly via a [interop call](http://reagent-project.github.io/docs/master/InteropWithReact.html#creating-reagent-components-from-react-components).

Builds use [Shadow CLJS](https://github.com/thheller/shadow-cljs) for maximum compatibility with NPM libraries. You'll need a [Java SDK](https://adoptopenjdk.net/) (Version 8+, Hotspot) to use it. <br>
You can [import npm libraries](https://shadow-cljs.github.io/docs/UsersGuide.html#js-deps) using Shadow CLJS. See the [user manual](https://shadow-cljs.github.io/docs/UsersGuide.html) for more information.

## License

Released under MIT License

Copyright 2020 Robert Berger
