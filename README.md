
# jank-imgui demo

<img align="right" width="412" height="314" alt="image" src="https://github.com/user-attachments/assets/134d31c4-f8d8-4143-a5b6-4f28d6fd1922" />

Demonstrates calling the C++ [imgui](https://github.com/ocornut/imgui) library from jank to render a simple interactive GUI.

1. Compile imgui as a shared library:

    ```
    make libimgui.so
    ```

2. Run the jank demo (include/search paths may differ):

    ```
    jank -L/usr/lib/x86_64-linux-gnu -lglfw -lGL \
        -L. -limgui -Iimgui -Iimgui/backends \
        --module-path=. run-main imgui-demo
    ```
