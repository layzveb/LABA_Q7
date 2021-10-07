package Server.Commands;

import Controller.CommandWithoutArg;
import Server.Invoker;

public class Help extends AbstractCommand implements CommandWithoutArg {
    String name = "help";
    private Invoker invoker;

    public Help(Invoker invoker) {
        super("help", "вывод справки по доступным командам");
        this.invoker = invoker;
    }

    @Override
    public String execute(Object o) {
        return (invoker.getHelp());
    }

}
