# Java Fundamentals — Coursework 1

CS1IP 的 Java / JShell 基础练习，保留原有作业文件与方法名称。需要 **JDK 17 或更高版本**，不需要 Maven、Gradle 或第三方库。

| 文件 | 内容 | 使用方式 |
| --- | --- | --- |
| `Hello.jsh` | 输出问候语 | `jshell Hello.jsh` |
| `Ice.jsh` | 交互式冰淇淋价格计算 | 在 JShell 中 `/open Ice.jsh`，按提示输入学号、口味、数量 |
| `AverageGrades.jsh` | 多名学生的加权成绩 | `average_grades(grades, weights)` |
| `Sphere.jsh` | 由直径计算球体积 | `sphere(2.0)` |
| `SevenSegment.jsh` | 五行七段数码管输出，支持负数 | `display(-123)` |

## 快速开始

在仓库根目录运行：

```bash
java --version
jshell AverageGrades.jsh Sphere.jsh SevenSegment.jsh
```

然后在 JShell 中输入：

```java
average_grades(new int[][]{{80, 91}, {0, 100}}, new int[]{40, 60})
sphere(2.0)
display(-123)
/exit
```

成绩示例返回 `[86, 60]`；权重必须非负且总和为 100，成绩范围为 0–100。空学生列表返回空数组；非法权重、缺失成绩或不一致的列数会抛出 `IllegalArgumentException`。球体直径必须有限且非负。

`Ice.jsh` 是独立交互练习，应单独打开；目前仍要求有效的整数输入，不提供完整的交互输入重试。它保留原作业价格规则，不能作为支付系统使用。

## 自动测试

```bash
java --add-modules jdk.jshell tests/RunTests.java AverageGrades.jsh Sphere.jsh SevenSegment.jsh tests/checks.jsh
```

测试覆盖正常计算、空输入、非法权重/成绩、直径边界及负数显示。测试器会对编译错误或运行异常返回非零退出码；GitHub Actions 在 JDK 17 和 21 上运行同一命令。交互式冰淇淋练习不在自动回归范围内。

## 原始作业信息

Module Code: CS1IP
Assignment report Title: coursework1
Student Number: 32804182
Actual hrs spent for the assignment: six hours
