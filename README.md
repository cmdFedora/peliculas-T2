#peliculas-webapp

Aplicación web para gestión de alquiler de películas usando Spring Boot y Supabase.

## Funcionalidades

- Registrar clientes, películas y alquileres
- Visualizar alquileres activos y pasados
- Persistencia en Supabase

## Instalación

```bash
git clone https://github.com/cmdFedora/peliculas-T2.git
cd peliculas-webapp
mvn clean install
mvn spring-boot:run

## Algunos detalles de la migración

Este proyecto nace de una idea de actividad: migrar un proyecto previo en JPA puro
el cual se hizo previamente.

Aca se aplico investigacion de:


#peliculas-webapp

Aplicación web para gestión de alquiler de películas usando Spring Boot y Supaba>

## Funcionalidades

- Registrar clientes, películas y alquileres
- Visualizar alquileres activos y pasados
- Persistencia en Supabase

## Instalación

```bash
git clone https://github.com/cmdFedora/peliculas-T2.git
cd peliculas-webapp
mvn clean install
mvn spring-boot:run

## Principales anotaciones de Lombok y sus usos

| Anotación              | Descripción funcional / Para qué sirve                                                                 |
|------------------------|---------------------------------------------------------------------------------------------------------|
| `@Data`                | 🔁 Todo-en-uno: genera `getters`, `setters`, `toString`, `equals`, `hashCode`, y un constructor vacío. Ideal para clases modelo. |
| `@Getter`              | 📥 Genera `getters` automáticos para todos (o algunos) campos.                                          |
| `@Setter`              | 📤 Genera `setters` automáticos para todos (o algunos) campos.                                          |
| `@ToString`            | 📝 Genera un método `toString()` personalizado.                                                         |
| `@EqualsAndHashCode`   | ⚖️ Genera `equals()` y `hashCode()` basados en campos importantes.                                      |
| `@NoArgsConstructor`   | 🏗️ Genera un constructor vacío (sin argumentos).                                                        |
| `@AllArgsConstructor`  | 🏗️ Genera un constructor con todos los campos como parámetros.                                         |
| `@RequiredArgsConstructor` | 🏗️ Constructor solo con campos `final` o anotados con `@NonNull`.                               |
| `@Builder`             | 🧱 Implementa el patrón de diseño Builder para construir objetos de forma flexible.                    |
| `@Value`               | 🔒 Versión inmutable de `@Data`: clase final con campos privados y sin setters.                        |


Gracias a esto, Spring Boot nos ofrece una configuración rapida al aplicar Loombok.
Se integran de forma automatica ademas las dependencias para la ejecucion correcta del proyecto.

Hay menos codigo repetitivo.
Y En general, el proceso de desarrollo es mas simple que usar el modelo clasico de jpa puro.

Hay que agregar ademas que:

Hubieron diferentes desafios al momento de 
realizar esta migracion de proyecto, ya que esto 
nacio de una idea principal: Conocer nuevas 
tecnologias y aplicarlas para el desarrollo de 
nuestro aprendizaje.

## Agradecimientos

**✨ Profesor:** Ruiz Christian  
** Estudiante:** Daniel Gonzalez
