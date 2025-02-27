Builder Pattern – Dungeon Builder Example

Overview
This example demonstrates the Builder Pattern for constructing a complex Dungeon object. In our scenario, a Dungeon consists of several elements: a name, a list of Room objects, and a list of NPC objects. Instead of relying on a bulky constructor with numerous parameters, the builder allows for a step-by-step configuration. Once all parts are set up, calling the build() method returns the fully constructed Dungeon.
Why Builder?

Complex Object Setup:
A Dungeon can have multiple components (name, rooms, NPCs, etc.), and using a single constructor with all these parameters can be cumbersome and error-prone.
Readability:
The builder clarifies the construction process with intuitive methods like setDungeonName(), addRoom(), and addNPC(), making the code easier to read and maintain.
Flexibility:
The Builder Pattern makes it easy to add optional features (such as traps, secret passages, or treasure rooms) later without modifying the existing code structure.
