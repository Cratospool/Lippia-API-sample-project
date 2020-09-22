Feature: Spoti Api

@SpotiApi
Scenario Outline: Obtengo la lista de Albums y un artista
When realizo una peticion '<operation>' a '<entity>' al enpoint de spotify - '<request>'
Then obtengo el status code '<statusCode>'
  @SuccessSpoti
  Examples:
    | request                    | statusCode | operation | entity       |
    | request/rq_spotify         | 200        | GET       | NEW_RELEASES |
    | request/req_artist_spotify | 200        | GET       | ARTIST       |

  @FailSpoti
  Examples:
    | request                   | statusCode | operation | entity |
    | request/error_rq_spotify  | 400        | GET       | ERROR  |
  