# Ring Rest Example

This is just a basic example obtained from a variety of sources.  But most
of it is from [Baeldung](https://www.baeldung.com/clojure-ring), who provided 
an incomplete example as it only responds to a single end-point, so I wrapped 
it with compojure.

## Usage

Start the server...

```bash
lein ring server-headless
```

Curl the endpoints...

```bash
curl http://localhost:3000
curl http://localhost:3000/ip
curl "http://localhost:3000/echo?input=hey"
curl -c cookies.txt -b cookies.txt "http://localhost:3000/count"
curl -c cookies.txt -b cookies.txt "http://localhost:3000/count"
curl -c cookies.txt -b cookies.txt "http://localhost:3000/count"
```

## Docker

The docker is arranged so that dependency caching happens first, making it
so that the only time dependencies need to be resolved is when you change 
`project.clj`.

```bash
docker build -t ring-rest-example ./
docker run -p 3000:3000 -it --rm ring-rest-example
```

## License

Copyright © 2020 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.

