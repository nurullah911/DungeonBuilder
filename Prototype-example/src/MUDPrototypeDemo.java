public class MUDPrototypeDemo {
    public static void main(String[] args) {
        // Create a prototype Room
        Room prototypeRoom = new Room("Kitchen", "room for cooking and eating");

        // Clone the prototype Room twice
        Room cloneRoom1 = prototypeRoom.cloneEntity();
        Room cloneRoom2 = prototypeRoom.cloneEntity();

        // Modify cloneRoom2 to show it is a separate copy
        cloneRoom2.setName("Bedroom");
        cloneRoom2.setDescription("room for sleeping");

        // Output the Room details to compare prototype and clones
        System.out.println("Prototype Room: " + prototypeRoom);
        System.out.println("Clone Room 1: " + cloneRoom1);
        System.out.println("Clone Room 2: " + cloneRoom2);

        // Create a prototype NPC
        NPC prototypeNPC = new NPC("Villager", "Big Nose", 100);

        // Clone the prototype NPC twice
        NPC cloneNPC1 = prototypeNPC.cloneEntity();
        NPC cloneNPC2 = prototypeNPC.cloneEntity();

        // Modify cloneNPC2 to show that it is an independent copy
        cloneNPC2.setName("Witch");
        cloneNPC2.setHealth(150);

        // Output the NPC details to compare prototype and clones
        System.out.println("Prototype NPC: " + prototypeNPC);
        System.out.println("Clone NPC 1: " + cloneNPC1);
        System.out.println("Clone NPC 2: " + cloneNPC2);
    }
}
