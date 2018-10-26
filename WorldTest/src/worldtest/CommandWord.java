package worldtest;

public enum CommandWord
{
    GO("go"), QUIT("quit"), HELP("help"), LOOK("look"), UNKNOWN("?");
    
    private String commandString;
    
    CommandWord(String commandString)
    {
        this.commandString = commandString;
    }
    
    public String toString()
    {
        return commandString;
    }
}
