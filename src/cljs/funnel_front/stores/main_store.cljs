(ns funnel-front.stores.main-store)

(def app-state (atom {
  :token "abcdef"
  :queries [{:label "foo"
             :es-query "flop flip flup"
             :items [{:type :github-commit :json ""}]}
            {:label "bar"
             :es-query "blop blip blup"
             :items [{:type :trello-comment :json ""}]}]}))
