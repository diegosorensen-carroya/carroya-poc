#language: es
  Característica:
    Como usuario/comprador de CarroYa
    quiero poder colocar más fotos de buena calidad sin que tenga que pagar por eso,
    para que pueda transmitir confianza a mi anúncio, dando al comprador transparencia del estado actual del carro

  Escenario:  verificar que en una publicacion gratuita permita la publicacion de 20 fotos exitosa
    Dado que como usuario de CarroYa me encuentro realizando publicaciones
    Cuando realizo una publicacion 20 fotos de calidad
    Entonces verifico que la publicacion se realizo exitosamente


    Escenario: verificar que en una publicacion gratuita NO permita la publicacion de mas de 20 fotos
      Dado que como usuario de CarroYa me encuentro realizando publicaciones
      Cuando realizo una publicacion 21 fotos de calidad
      Entonces verifico que la publicacion se realizo exitosamente