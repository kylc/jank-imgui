
# jank-imgui demo

<img align="right" width="364" height="319" alt="image" src="https://github.com/user-attachments/assets/88c8a26a-fd94-4ea3-9b43-8db26856a80c" />

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
