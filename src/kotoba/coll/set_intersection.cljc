(ns kotoba.coll.set-intersection
  "set-intersection -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds set-intersection and names, in its
  deps.edn, exactly the definitions set-intersection reaches. Nothing else."
  )

(defn set-intersection
  "Intersection of one or more sets. Mirrors clojure.set/intersection."
  ([s1] s1)
  ([s1 s2] (into (empty s1) (filter #(contains? s2 %)) s1))
  ([s1 s2 & sets] (reduce set-intersection (set-intersection s1 s2) sets)))
