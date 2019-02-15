package main.command;

/**
 * Author : axiao
 * Description : 请求角色类
 * User : axiao
 * Date : Created in 2019/2/15 23:29
 * Modified By :
 */
public class Invoker {

    private Command command = null;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }

    public void undo() {
        command.undo();
    }
}
