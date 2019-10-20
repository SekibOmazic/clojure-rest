# clojure-rest

This is a simple playground for clojure and postgreSQL. It exposes a simple API end point for some REST experimenting. Based on [this cool article](https://itnext.io/getting-started-with-clojure-e8f207ff8eab)


## Installation

Clone the repo from `https://github.com/SekibOmazic/clojure-rest`


## How to start

Make sure you have `docker` and `leiningen` installed on your machine. Then:

1. run `./startdb.sh` from the terminal to start Postgresql in a docker container
2. `lein run server`
3. point your browser to http://localhost:3000/friends to get a list of friends
4. to add a new friend do this from your terminal: 
```
curl localhost:3000/friends -X POST -H "Content-Type: application/json" -d {"name": "John Doe", "nickname": "Joey", "occupation":"doctor"}
```
