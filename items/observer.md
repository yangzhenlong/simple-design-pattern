# 观察者模式

```text
也叫 发布/订阅 或者 Pub/Sub 模式。

一个目标对象管理所有相依于它的观察者对象，并且在它本身的状态改变时主动发出通知。

此种模式通常被用来实时事件处理系统。
```

## 业务场景

```text
某明星发布一条微博，所有订阅了该明星的粉丝都会收到通知
```

## 代码实现

