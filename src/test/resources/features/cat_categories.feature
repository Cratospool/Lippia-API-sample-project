Feature: Cat API

  COMO usuario de CAT API
  DESEO obtenes la lista de ategorias
  PARA mostrar la misma
  @CatApi
    Scenario Outline: Obtengo la lista de categorias
      When realizo una peticion '<operation>' a '<entity>' al enpoint de categorias - '<request>'
      Then obtengo el status code '<statusCode>'
      And los datos son correctos
    @SuccessCat
    Examples:
      | request                   | statusCode | operation | entity     |
      | request/rq_cat_categories | 200        | GET       | CATEGORIES |
    @FailCat
    Examples:
      | request                   | statusCode | operation | entity     |
      | request/rq_cat_categories | 400        | GET       | CATEGORIES |
  @CatApi
  Scenario Outline: analisis de imagenes
    When realizo una peticion '<operation>' a '<entity>' al enpoint de analisis - '<request>'
    Then obtengo el status code '<statusCode>'
    @AnalysisCat
    Examples:
      | request              | statusCode | operation | entity   |
      | request/cat_analysis | 401        | POST      | ANALYSIS |


