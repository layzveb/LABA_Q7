package Server.Commands;

import Controller.CommandWithoutArg;

public class Exit extends AbstractCommand implements CommandWithoutArg {

    public Exit() {
        super("exit", "завершение программы без сохранения в файл");
    }

    @Override
    public String execute(Object o) {
        System.exit(0);
        return null;
    }
}