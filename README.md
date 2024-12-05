## Interface: ``` Shape3DInterface```
```Purpose:```` Defines a contract for 3D shapes, ensuring all implementing classes provide 
methods for calculating surface area and volume.
Why Use an Interface? It ensures a common structure across all shapes,
enabling polymorphism (treating different shapes as the same type).

```Shape Classes```
Purpose: Each shape (Sphere, Cylinder, Cube) implements the Shape3DInterface to 
provide specific implementations for surface area and volume calculations.
``Key Points:``
Stores the radius as a private field.

Implements the surface area and volume formulas specific to a sphere.

Overrides toString() to provide meaningful output for the shape.

```Cylinder```
``Key Points:``
Stores radius and height as private fields.

Implements the cylinder-specific formulas for surface area and volume.

```Cube```
``Key Points:``
Stores the side length as a private field.

Implements the cube-specific formulas for surface area and volume.

``` Main Class````

Purpose: Handles the logic for creating random shapes, 
calculating their properties, and displaying results.


Sphere with radius 3.45
Surface Area: 149.65
Volume: 172.23
----------------------

Cylinder with radius 2.8 and height 13.4
Surface Area: 287.55
Volume: 330.22
----------------------

Cube with side length 4.1
Surface Area: 100.86
Volume: 68.92
----------------------
