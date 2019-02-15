package main.command;

/**
 * Author : axiao
 * Description : 抽象命令角色类
 * User : axiao
 * Date : Created in 2019/2/15 23:25
 * Modified By :
 */
public interface Command {

    void execute();

    void undo();
}
