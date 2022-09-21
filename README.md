## Gestion de cobros de peaje

Programa que nos permitira gestionar los cobros de las autopistas de peaje

## Estructura del proyecto

Un usuario de una autopista accede a ella por un punto kilometrico y a la entrada entrega un ticket donde se registra el kilometro de entrada.
Cuando abandonde la autopista se registra en el ticket el kilometro de salida y empieza a calcular la tarifa.
Existe un ticket general para la mayor parte de los vehiculos y un ticket especial para los autobuses.

## Funcionamiento del proyecto

El calculo de la tarifa del ticket general se aplica la formuka basica `kmRecorrido*precio` (km recorridos X precio/kilometro).
En el caso de los autobuses se aplica la misma multiplicando el numero de pasajeros del autobus.

> Ademas, tiene una posibilidad de aplicar una reduccion de la tarifa. Para los autobuses un 5% a partir de los 100km y para el resto un 10% a partir de los 500km.

Este programa se compone de varias clases:
- Clase interfaz `ITicket`.
- Clase abstracta `Ticket` que implementa de la clase interfaz `ITicket`.
- Subclases `TicketGeneral` y `TicketEspecial` que extiende a la superclase `Ticket`.
- Clase ejecutable `Launcher`(main).
