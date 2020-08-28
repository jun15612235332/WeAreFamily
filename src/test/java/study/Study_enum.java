package study;
/**
 * @Des 学习枚举
 * @Author SunXianJun
 * @Date 2020/8/28 16:58
 */
public class Study_enum {
    public static void main(String[] args) {

    }

    /**
     * 关于类型  状态这类问题, 除了定义常量外还可以使用枚举定义
     */
    public enum Status{

        STATUS_ACCEPT("accept", 0),
        STATUS_BAN("ban", 1),
        STATUS_REJECTS("reject", 2);

        String str;
        int status;

        Status(String str, int status) {
            this.str = str;
            this.status = status;
        }

        public static Status createBySource(String str) {
            for (Status one : Status.values()) {
                if (one.str.equalsIgnoreCase(str)) {
                    return one;
                }
            }
            return null;
        }

    }
}
