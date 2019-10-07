### TCP 握手挥手图
#### TCP 握手图
![TCP握手图](https://i.loli.net/2019/10/07/XGwS4aHJ6zjusVE.png)

#### TCP挥手图
![TCP挥手图](https://i.loli.net/2019/10/07/e6Yp9qWwzOBZTcv.png)

#### TIME_WAIT
客户端向服务器发送FIN响应报文之后会等待2MSL的时间,这个阶段称为TIME_WAIT.
MSL表示最大报文时间,表示报文在网络中所能存活的最大时间.
* 如果客户端在2MSL时间内接收到服务器重发的FIN报文,就表示服务器没有收到客户端的发出的FIN应答报文,此时需要重发应答报文,并再次等待2MSL时间;
* 如果客户端在2MSL时间内没有接收到服务器重发的FIN报文,就表示服务器收到了客户端发出的FIN应答报文,此时可以关闭连接.

###  Nagle 算法伪代码
```
    if 没有数据包要发送
        return
        
    把数据包添加到发送队列
        
    if 发送队列数据长度 >= MSS
        立即发送
        return
        
    if 包含有 FIN
        立即发送
        return
        
    if TCP_NODELAY
        立即发送
        return
        
    if TCP_CORK && 所有小数据包均被确认
        立即发送
        return
        
    if 发生超时
        立即发送
        return
 
```


### 描述清楚 TCP 与 UDP 的区别与联系，设计一个 TCP 与 UDP 混合使用的技术方案。
