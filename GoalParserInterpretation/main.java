class GoalParser {
    public static void main(String[] args){
        String command = "G()(al)";
        System.out.println(interpret(command));
        command = "G()()()()(al)";
        System.out.println(interpret(command));
    }

    public static String interpret(String command) {

        // G = G, () = o, (al) = al
        // leave G alone as it is itself

        // replace all () with o
        while(command.contains("()"))
            command = command.replace("()", "o");

        // replace all (al) with al
        while(command.contains("(al)"))
            command = command.replace("(al)", "al");

        // could've honestly used replaceAll method for each but meh

        return command;
    }
}