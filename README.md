# MiniJava Project

#### 小组成员
- ihciah 13307130364 : 代码、文档
- chengshuo 13307130235 :

#### 代码运行
- Java部分(分析生成语法树，并展示为图片和文件)：

  `java org.antlr.v4.Tool MiniJava.g4`

  `javac MiniJava*.java`

  `java org.antlr.v4.gui.TestRig MiniJava goal binarysearch.java -gui`

  `java org.antlr.v4.gui.TestRig MiniJava goal binarysearch.java -tree > binarysearch.tree`

- Python部分

  `python my.py binarysearch.java`

#### 运行依赖
- Python2.7 + ANTLRv4 + JRE
