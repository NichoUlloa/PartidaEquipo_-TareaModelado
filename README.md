## Caso Partida Equipo
### Descripción:
Un equipo tiene al menos un jugador y cada jugador pertenece a un sólo equipo. Cada equipo es capitaneado por un jugador. Además, cada partida jugada contiene al menos un árbitro.

### Clases principales:
- Equipo
- Jugador
- Partida
- Árbitro

### Métodos principales:
- agregarJugador
- eliminarJugador
- buscarJugador

### Relaciones entre clases principales:
- Partida tiene un equipo (1)
- Equipo tiene jugadores (1..*)
- Equipo tiene un capitán (1)
- Partida tiene equipo (1)
- Partida tiene árbitros (1..*)
- Jugador pertenece a un equipo (1)

### Diagrama de clases:
![PartidaEquipoUML](https://github.com/NichoUlloa/PartidaEquipo_-TareaModelado/assets/145157325/47e9509a-1603-49c0-93b2-a05ec62088b3)
