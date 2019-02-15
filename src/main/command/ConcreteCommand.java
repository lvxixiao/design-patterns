package main.command;

/**
 * Author : axiao
 * Description : 具体命令角色类
 * User : axiao
 * Date : Created in 2019/2/15 23:25
 * Modified By :
 */
public class ConcreteCommand implements Command {

    private Receiver receiver = null;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void undo() {
        receiver.undo();
    }
}
