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
