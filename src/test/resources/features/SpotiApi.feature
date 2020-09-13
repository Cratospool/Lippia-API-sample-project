Feature: Spoti Api

@SpotiApi
Scenario Outline: Obtengo la lista de categorias
When realizo una peticion '<operation>' a '<entity>' al enpoint de spotify - '<request>'
Then obtengo el status code '<statusCode>'
Examples:
  | request                   | statusCode | operation | entity       |
  | request/rq_spotify        | 200        | GET       | NEW_RELEASES |