(ns funnel-front.stores.main-store)

(def app-state (atom {
  :token "64b51cd543da47b2ab2aa4514374640d"
  :index-id "5c9ed77507174544bb8b8f9b50480401"
  :current-query "foo"
  :example-query-id "b273d5362c0f42a6b198e5e3ab7374da"
  :queries {
            :e8fb941f95c4470c9f1d1175578f352c {:label "foo"
                  :es-query "flop flip flup"
                  :query_id "id1"
                  :items [{:type :github-commit :json ""}]}
            :id2 {:label "bar"
                  :es-query "blop blip blup"
                  :query_id "id2"
                  :items [{:type :trello-comment :json ""}]}}}))
