
# [Lab 0: Networking Warmup](https://cs144.github.io/assignments/lab0.pdf)

> The lab documents aren’t “specifications”—meaning they’re not intended to be consumed in a one-way fashion. They’re written closer to the level of detail that a software engineer will get from a boss or client. We expect that you’ll benefit from attending the lab sessions and asking clarifying questions if you find something to be ambiguous and you think the answer matters. (If you think something might not be fully specified, sometimes the truth is that it doesn’t matter—you could try one approach or the other and see what happens.)

## 0. Prerequisites

Linux Command:

- GUI Setting

```$ sudo apt-get install --reinstall lightdm```

```$ sudo systemctl start lightdm```

```GUI: ctrl + Alt + F7```
```Command: ctrl + Alt + F6```


## 1. Fetch a Web Page

* run ```telnet cs144.keithw.org http```-> build a byte stream between your computer and another named cs144.keithw.org, and particular service http running on that computer.


## 2. Send yourself an email

Because I could not use Stanford Service, So could not do it.

## 3. Listening and connecting

Use ```netcat``` program.

```$cs144@vm~: netcat -v -l -p 9090 ```

```$cs144@vm~: telnet localhost 9090```


## 4. Program: webget

> Cmake Sponge lib in Linux.
