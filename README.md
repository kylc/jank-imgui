
# jank-imgui demo

<img align="right" width="418" height="316" alt="image" src="https://github.com/user-attachments/assets/311b2f11-43cd-4d38-a641-630c18675d3a" />

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
