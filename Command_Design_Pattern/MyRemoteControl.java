package Design_Pattern.Command_Design_Pattern;

import java.util.Stack;

public class MyRemoteControl {
    Stack<IOCommand> aCommandHistory=new Stack<>();
    IOCommand ioCommand;
    MyRemoteControl(){
       
    }
    public void setCommands(IOCommand ioCommand){
        this.ioCommand=ioCommand;
    }
    public void pressButton(){
        ioCommand.exceute();
        aCommandHistory.push(ioCommand);
    }
    public void undo(){
        if(!aCommandHistory.empty()){
            aCommandHistory.pop().undo();
        }
    }
}
