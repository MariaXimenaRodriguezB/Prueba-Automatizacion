# Pruebas Automatizadas

Este documento proporciona instrucciones sobre cómo configurar y ejecutar las pruebas automatizadas para este proyecto.

## Requisitos Previos

- Java (versión 11 o superior)
- Gradle (versión 6.0 o superior)

## Instalación

  Clona el repositorio:

   git clone https://github.com/MariaXimenaRodriguezB/Prueba-Automatizacion.git

## Casos de Prueba

  Aplicativo OrangeHRM

- Registro de empleados

## Ejecucion

NOTA : Los datos utilizados en la ejecucion se pueden ingresar a traves del scenario outline. NO es necesario modificarlos de manera frecuente; 
ya que a traves del codigo, los campos que deben ser unicos para el aplicativo, se generan de forma aleatoria, tomando como base del texto, lo ingresado en la tabla del Scenario Oultine.

./gradlew clean test aggregate -D url=urlAplicativo -D user=usuarioAdministrador -D pass=contraseñaAdministrador

* Se debe cambiar urlAplicativo, usuarioAdministrador y contraseñaAdministrador; por los valores correspondientes.

  

  
   
