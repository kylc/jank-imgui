# Table of contents
-  [`imgui.backend.glfw-opengl2`](#imgui.backend.glfw-opengl2) 
    -  [`create-window`](#imgui.backend.glfw-opengl2/create-window)
    -  [`run`](#imgui.backend.glfw-opengl2/run)
-  [`imgui.ui`](#imgui.ui) 
    -  [`begin`](#imgui.ui/begin) - Push a new window to the stack.
    -  [`begin-child`](#imgui.ui/begin-child)
    -  [`begin-combo`](#imgui.ui/begin-combo)
    -  [`bullet`](#imgui.ui/bullet)
    -  [`button`](#imgui.ui/button)
    -  [`calc-text-size`](#imgui.ui/calc-text-size)
    -  [`checkbox`](#imgui.ui/checkbox)
    -  [`child-flag-map`](#imgui.ui/child-flag-map)
    -  [`content-region-avail`](#imgui.ui/content-region-avail)
    -  [`cursor-screen-pos`](#imgui.ui/cursor-screen-pos)
    -  [`display-size`](#imgui.ui/display-size)
    -  [`dummy`](#imgui.ui/dummy)
    -  [`end`](#imgui.ui/end) - Pop the current window from the stack.
    -  [`end-child`](#imgui.ui/end-child)
    -  [`end-combo`](#imgui.ui/end-combo)
    -  [`input-text`](#imgui.ui/input-text)
    -  [`input-text-multiline`](#imgui.ui/input-text-multiline)
    -  [`new-line`](#imgui.ui/new-line)
    -  [`pop-id`](#imgui.ui/pop-id)
    -  [`pop-style-color`](#imgui.ui/pop-style-color)
    -  [`pop-style-var`](#imgui.ui/pop-style-var)
    -  [`progress-bar`](#imgui.ui/progress-bar)
    -  [`push-id`](#imgui.ui/push-id)
    -  [`push-style-color`](#imgui.ui/push-style-color)
    -  [`push-style-var`](#imgui.ui/push-style-var)
    -  [`radio-button`](#imgui.ui/radio-button)
    -  [`same-line`](#imgui.ui/same-line)
    -  [`selectable`](#imgui.ui/selectable)
    -  [`separator`](#imgui.ui/separator)
    -  [`set-cursor-pos`](#imgui.ui/set-cursor-pos)
    -  [`set-cursor-pos-x`](#imgui.ui/set-cursor-pos-x)
    -  [`set-cursor-pos-y`](#imgui.ui/set-cursor-pos-y)
    -  [`small-button`](#imgui.ui/small-button)
    -  [`style-colors-map`](#imgui.ui/style-colors-map)
    -  [`style-vars-map`](#imgui.ui/style-vars-map)
    -  [`text`](#imgui.ui/text)
    -  [`text-link`](#imgui.ui/text-link)
    -  [`vec2`](#imgui.ui/vec2) - Coerce to ImVec2.
    -  [`vec2->`](#imgui.ui/vec2->)
    -  [`vec4`](#imgui.ui/vec4) - Coerce to ImVec4.
    -  [`vec4->`](#imgui.ui/vec4->)
    -  [`window-flag-map`](#imgui.ui/window-flag-map)
    -  [`with-child`](#imgui.ui/with-child)
    -  [`with-combo`](#imgui.ui/with-combo)
    -  [`with-scope`](#imgui.ui/with-scope) - Supported keys are are :id (see [<code>push-id</code>](#imgui.ui/push-id)), :style (see [<code>push-style-var</code>](#imgui.ui/push-style-var) for options), :color (see [<code>push-style-color</code>](#imgui.ui/push-style-color) for options), etc.
    -  [`with-window`](#imgui.ui/with-window) - Wrap an expression inside a new window.

-----
# <a name="imgui.backend.glfw-opengl2">imgui.backend.glfw-opengl2</a>






## <a name="imgui.backend.glfw-opengl2/create-window">`create-window`</a>
``` clojure
(create-window width height name)
```
Function.
<p><sub><a href="/blob/main/src/imgui/backend/glfw_opengl2.jank#L6-L9">Source</a></sub></p>

## <a name="imgui.backend.glfw-opengl2/run">`run`</a>
``` clojure
(run {:keys [name width height frame-rate], :or {name "", width 200, height 200}} app)
```
Function.
<p><sub><a href="/blob/main/src/imgui/backend/glfw_opengl2.jank#L11-L51">Source</a></sub></p>

-----
# <a name="imgui.ui">imgui.ui</a>






## <a name="imgui.ui/begin">`begin`</a>
``` clojure
(begin {:keys [name pos size collapsed? min-size max-size bg-alpha window-flags], :or {name ""}})
```
Function.

Push a new window to the stack.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L71-L82">Source</a></sub></p>

## <a name="imgui.ui/begin-child">`begin-child`</a>
``` clojure
(begin-child {:keys [name size child-flags window-flags], :or {name "", size [0.0 0.0]}, :as attrs})
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L115-L123">Source</a></sub></p>

## <a name="imgui.ui/begin-combo">`begin-combo`</a>
``` clojure
(begin-combo {:keys [label preview-value], :or {preview-value ""}})
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L179-L181">Source</a></sub></p>

## <a name="imgui.ui/bullet">`bullet`</a>
``` clojure
(bullet)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L169-L170">Source</a></sub></p>

## <a name="imgui.ui/button">`button`</a>
``` clojure
(button {:keys [label size on-click], :or {label "", size [0.0 0.0]}})
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L145-L150">Source</a></sub></p>

## <a name="imgui.ui/calc-text-size">`calc-text-size`</a>
``` clojure
(calc-text-size s)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L41-L42">Source</a></sub></p>

## <a name="imgui.ui/checkbox">`checkbox`</a>
``` clojure
(checkbox {:keys [label checked?]})
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L155-L158">Source</a></sub></p>

## <a name="imgui.ui/child-flag-map">`child-flag-map`</a>



<p><sub><a href="/blob/main/src/imgui/ui.jank#L104-L113">Source</a></sub></p>

## <a name="imgui.ui/content-region-avail">`content-region-avail`</a>
``` clojure
(content-region-avail)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L29-L30">Source</a></sub></p>

## <a name="imgui.ui/cursor-screen-pos">`cursor-screen-pos`</a>
``` clojure
(cursor-screen-pos)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L26-L27">Source</a></sub></p>

## <a name="imgui.ui/display-size">`display-size`</a>
``` clojure
(display-size)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L22-L24">Source</a></sub></p>

## <a name="imgui.ui/dummy">`dummy`</a>
``` clojure
(dummy size)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L248-L249">Source</a></sub></p>

## <a name="imgui.ui/end">`end`</a>
``` clojure
(end)
```
Function.

Pop the current window from the stack.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L84-L87">Source</a></sub></p>

## <a name="imgui.ui/end-child">`end-child`</a>
``` clojure
(end-child)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L125-L127">Source</a></sub></p>

## <a name="imgui.ui/end-combo">`end-combo`</a>
``` clojure
(end-combo)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L183-L184">Source</a></sub></p>

## <a name="imgui.ui/input-text">`input-text`</a>
``` clojure
(input-text label text)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L213-L216">Source</a></sub></p>

## <a name="imgui.ui/input-text-multiline">`input-text-multiline`</a>
``` clojure
(input-text-multiline label text)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L218-L221">Source</a></sub></p>

## <a name="imgui.ui/new-line">`new-line`</a>
``` clojure
(new-line)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L245-L246">Source</a></sub></p>

## <a name="imgui.ui/pop-id">`pop-id`</a>
``` clojure
(pop-id)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L385-L386">Source</a></sub></p>

## <a name="imgui.ui/pop-style-color">`pop-style-color`</a>
``` clojure
(pop-style-color)
(pop-style-color n)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L378-L380">Source</a></sub></p>

## <a name="imgui.ui/pop-style-var">`pop-style-var`</a>
``` clojure
(pop-style-var)
(pop-style-var n)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L305-L307">Source</a></sub></p>

## <a name="imgui.ui/progress-bar">`progress-bar`</a>
``` clojure
(progress-bar fraction)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L166-L167">Source</a></sub></p>

## <a name="imgui.ui/push-id">`push-id`</a>
``` clojure
(push-id id)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L382-L383">Source</a></sub></p>

## <a name="imgui.ui/push-style-color">`push-style-color`</a>
``` clojure
(push-style-color var value)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L372-L376">Source</a></sub></p>

## <a name="imgui.ui/push-style-var">`push-style-var`</a>
``` clojure
(push-style-var var value)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L297-L303">Source</a></sub></p>

## <a name="imgui.ui/radio-button">`radio-button`</a>
``` clojure
(radio-button {:keys [label active?], :or {active? false}})
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L160-L164">Source</a></sub></p>

## <a name="imgui.ui/same-line">`same-line`</a>
``` clojure
(same-line)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L242-L243">Source</a></sub></p>

## <a name="imgui.ui/selectable">`selectable`</a>
``` clojure
(selectable label selected?)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L227-L230">Source</a></sub></p>

## <a name="imgui.ui/separator">`separator`</a>
``` clojure
(separator)
(separator text)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L238-L240">Source</a></sub></p>

## <a name="imgui.ui/set-cursor-pos">`set-cursor-pos`</a>
``` clojure
(set-cursor-pos v)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L32-L33">Source</a></sub></p>

## <a name="imgui.ui/set-cursor-pos-x">`set-cursor-pos-x`</a>
``` clojure
(set-cursor-pos-x x)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L35-L36">Source</a></sub></p>

## <a name="imgui.ui/set-cursor-pos-y">`set-cursor-pos-y`</a>
``` clojure
(set-cursor-pos-y y)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L38-L39">Source</a></sub></p>

## <a name="imgui.ui/small-button">`small-button`</a>
``` clojure
(small-button {:keys [label]})
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L152-L153">Source</a></sub></p>

## <a name="imgui.ui/style-colors-map">`style-colors-map`</a>



<p><sub><a href="/blob/main/src/imgui/ui.jank#L309-L370">Source</a></sub></p>

## <a name="imgui.ui/style-vars-map">`style-vars-map`</a>



<p><sub><a href="/blob/main/src/imgui/ui.jank#L253-L295">Source</a></sub></p>

## <a name="imgui.ui/text">`text`</a>
``` clojure
(text s)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L140-L141">Source</a></sub></p>

## <a name="imgui.ui/text-link">`text-link`</a>
``` clojure
(text-link label)
(text-link label url)
```
Function.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L172-L174">Source</a></sub></p>

## <a name="imgui.ui/vec2">`vec2`</a>
``` clojure
(vec2 xy)
(vec2 x y)
```
Macro.

Coerce to ImVec2.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L6-L9">Source</a></sub></p>

## <a name="imgui.ui/vec2->">`vec2->`</a>
``` clojure
(vec2-> v)
```
Macro.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L11-L12">Source</a></sub></p>

## <a name="imgui.ui/vec4">`vec4`</a>
``` clojure
(vec4 xyzw)
(vec4 x y z w)
```
Macro.

Coerce to ImVec4.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L14-L17">Source</a></sub></p>

## <a name="imgui.ui/vec4->">`vec4->`</a>
``` clojure
(vec4-> v)
```
Macro.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L19-L20">Source</a></sub></p>

## <a name="imgui.ui/window-flag-map">`window-flag-map`</a>



<p><sub><a href="/blob/main/src/imgui/ui.jank#L46-L69">Source</a></sub></p>

## <a name="imgui.ui/with-child">`with-child`</a>
``` clojure
(with-child attrs & body)
```
Macro.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L129-L136">Source</a></sub></p>

## <a name="imgui.ui/with-combo">`with-combo`</a>
``` clojure
(with-combo attrs & body)
```
Macro.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L186-L189">Source</a></sub></p>

## <a name="imgui.ui/with-scope">`with-scope`</a>
``` clojure
(with-scope attrs & body)
```
Macro.

Supported keys are are :id (see [`push-id`](#imgui.ui/push-id)), :style (see
  [`push-style-var`](#imgui.ui/push-style-var) for options), :color (see [`push-style-color`](#imgui.ui/push-style-color) for
  options), etc.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L388-L400">Source</a></sub></p>

## <a name="imgui.ui/with-window">`with-window`</a>
``` clojure
(with-window attrs & body)
```
Macro.

Wrap an expression inside a new window.

  If the window is closed then the body will not be evaluated. Prefer
  this over manual calls to [`begin`](#imgui.ui/begin) and [`end`](#imgui.ui/end). See [`begin`](#imgui.ui/begin) for allowed
  options.

  Returns true/false to indicate the window is open/closed.
<p><sub><a href="/blob/main/src/imgui/ui.jank#L89-L102">Source</a></sub></p>
