(defproject io.github.kylc/jank-imgui "0.1.0"
  :description "Create Dear ImGui GUIs in jank"
  :url "https://github.com/kylc/jank-imgui"
  :license {:name "MPL 2.0"
            :url  "https://www.mozilla.org/en-US/MPL/2.0/"}
  :dependencies [[org.jank-lang.commons/imgui-glfw-sys "2026.09-9"]
                 [org.jank-lang.commons/imgui-opengl2-sys "2026.09-6"]
                 [org.jank-lang.commons/imgui-sys "2026.09-3"]]
  :plugins [[org.jank-lang/lein-jank "2026.09-9"]]
  :middleware [leiningen.jank/middleware]
  :source-paths ["src" "examples"]
  :profiles {:base    {:jank {:target-dir         "target/debug"
                              :optimization-level 0}}
             :release {:jank {:target-dir         "target/release"
                              :optimization-level 3}}})
