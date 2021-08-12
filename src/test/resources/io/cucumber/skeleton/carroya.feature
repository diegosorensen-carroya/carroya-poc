#language: es
 Característica: Busqueda de un carro

  Esquema del escenario: Busqueda de un carro en el portal carroya

     Dado que estoy en website de http://www.carroya.com
     Cuando busco un carro de <marca> con <linea>
     Entonces quiero verificar que la busqueda retorne vehiculos
    Ejemplos:
      |  marca |    linea|
      |Chevrolet|  Alto |
      |Ford     |  Aerostar |
      |Aro     |  Carpati |
