#language: es
 Característica: Busqueda de un carro

  Esquema del escenario: Busqueda de un carro en el portal carroya
     Dado que estoy en la pagina de carroya
     Cuando busco un carro de <marca> con <linea>
     Entonces quiero obtener la cantidad de resultados
    Ejemplos:
      |  marca|    linea|
      |Chevrolet|  Alto |

