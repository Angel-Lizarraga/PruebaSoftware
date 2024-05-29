SGEEBE - Sistema de Gestión de Eventos del Escenario del Bazar La Estación
Descripción
SGEEBE, también conocido como Eventstation, es una plataforma para la gestión de eventos del bazar "La Estación". Esta aplicación permite a los gestores de eventos controlar la agenda, a los solicitantes reservar escenarios y a los visitantes consultar el calendario de eventos.

Tabla de Contenidos
Descripción
Propósito
Alcance
Instalación
Uso
Estructura del Proyecto
Requisitos
Contribuciones
Licencia
Propósito
El propósito de este proyecto es proporcionar una visión clara de la arquitectura del sistema y facilitar la gestión de eventos del bazar "La Estación". El sistema incluye funcionalidades para la reserva de eventos, control de agenda y visualización del calendario de eventos.

Alcance
Este proyecto abarca todos los diagramas y detalles necesarios para la construcción del sistema, utilizando diversas vistas como casos de uso, lógica, despliegue, implementación y datos.

Instalación
Para instalar y ejecutar este proyecto en NetBeans, sigue los siguientes pasos:

Clonar el repositorio:

bash
Copiar código
git clone https://github.com/tu-usuario/eventstation.git
Importar el proyecto en NetBeans:

Abre NetBeans.
Ve a File -> Open Project.
Navega a la carpeta donde clonaste el repositorio y selecciona la carpeta del proyecto.
Ejecutar el proyecto:

Haz clic derecho en el proyecto en el panel de proyectos.
Selecciona Run.
Uso
Una vez instalado y ejecutado el proyecto, puedes utilizar las funcionalidades básicas descritas a continuación. Las clases principales son:

Administrador
autenticar(): Autentica al administrador.
consultarSolicitudes(): Consulta las solicitudes de escenarios.
aceptarSolicitud(): Acepta una solicitud de escenario.
rechazarSolicitud(): Rechaza una solicitud de escenario.
publicarEvento(): Publica un evento en el calendario.
consultarCalendario(): Consulta el calendario de eventos.
editarCalendario(): Edita el calendario de eventos.
administraEscenario(Escenario escenario): Asigna un escenario al administrador.
gestionaCalendario(Calendario calendario): Asigna un calendario al administrador.
Visitante
consultarCalendario(): Consulta el calendario de eventos.
SolicitanteDeEscenario
solicitarEscenario(): Solicita un escenario.
editarSolicitud(): Edita una solicitud de escenario.
borrarSolicitud(): Borra una solicitud de escenario.
ocuparEscenario(Escenario escenario): Ocupa un escenario.
desocuparEscenario(): Desocupa un escenario.
getEscenario(): Obtiene el escenario asignado.
Estructura del Proyecto
La estructura del proyecto incluye las siguientes clases:

Administrador: Gestiona el escenario y el calendario.
Visitante: Consulta el calendario de eventos.
SolicitanteDeEscenario: Solicita y gestiona reservas de escenarios.
Calendario: Contiene una lista de eventos.
Escenario: Detalles del escenario y su capacidad.
Evento: Detalles de un evento específico.
Tablón: Detalles de los tablones del escenario.
PruebaSoftware: Clase principal para ejecutar y probar el sistema.
Requisitos
El sistema se desarrollará utilizando las siguientes tecnologías:

IDE: NetBeans
Lenguaje de Programación: Java
Contribuciones
Las contribuciones son bienvenidas. Para contribuir, sigue estos pasos:

Haz un fork del proyecto.
Crea una nueva rama (git checkout -b feature/nueva-funcionalidad).
Realiza tus cambios y haz commit (git commit -am 'Añadir nueva funcionalidad').
Sube tu rama (git push origin feature/nueva-funcionalidad).
Abre un Pull Request.
Licencia
Este proyecto está bajo la licencia MIT. Para más detalles, consulta el archivo LICENSE.

Este README proporciona una guía completa y clara para cualquier persona que desee entender, instalar, usar y contribuir al proyecto SGEEBE.
