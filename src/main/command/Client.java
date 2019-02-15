package main.command;

/**
 * Author : axiao
 * Description : 客户端角色类
 * User : axiao
 * Date : Created in 2019/2/15 23:30
 * Modified By :
 */
public class Client {

    public static void main(String[] args) {
        // 创建接收者
        Receiver receiver = new Receiver();
        // 创建命令对象，设定其接收者
        Command command = new ConcreteCommand(receiver);
        // 创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        // 执行方法
        invoker.action();
        // 撤销
        invoker.undo();
    }
}
