(ns funnel-front.stores.main-store)

(def app-state (atom {
  :token "64b51cd543da47b2ab2aa4514374640d"
  :index-id "5c9ed77507174544bb8b8f9b50480401"
  :current-query :dc94eb136e9b46a8919a2aad3e82000b
  :example-query-id "b273d5362c0f42a6b198e5e3ab7374da"
  :queries {
            :e8fb941f95c4470c9f1d1175578f352c
            {:label "foo"
             :es-query "flop flip flup"
             :query_id "id1"
             :items [{:type :github-commit :json "{a: \"a\"}"}]}
            :dc94eb136e9b46a8919a2aad3e82000b
            {:label "bar"
             :es-query "blop blip blup"
             :query_id "id2"
             :items [{:type :trello-comment :json ""}
                     ]}}}))


(defn triquer []
  (swap! app-state update-in
           [:queries :dc94eb136e9b46a8919a2aad3e82000b :items]
           conj
           {:body {"compare" "https://github.com/AF83/funnel_http/compare/a6e82e80c30f...4fec1337b1ef", "pusher" {"email" "chatgri@gmail.com", "name" "chatgris"}, "created" false, "repository" {"size" 220, "fork" false, "private" false, "has_downloads" true, "created_at" 1402309085, "name" "funnel_http", "homepage" "", "url" "https://github.com/AF83/funnel_http", "open_issues" 0, "forks" 0, "organization" "AF83", "owner" {"email" nil, "name" "AF83"}, "has_wiki" true, "watchers" 0, "stargazers" 0, "language" "Elixir", "pushed_at" 1403279902, "id" 20642419, "description" "Streaming API built upon ElasticSearch's percolation.", "master_branch" "master", "has_issues" true}, "ref" "refs/heads/master", "head_commit" {"removed" [], "added" [], "message" "Fix README\n\nSigned-off-by: chatgris <julien.boyer@af83.com>", "modified" ["README.md"], "committer" {"email" "jboyer@af83.com", "name" "chatgris", "username" "chatgris"}, "author" {"email" "jboyer@af83.com", "name" "chatgris", "username" "chatgris"}, "url" "https://github.com/AF83/funnel_http/commit/4fec1337b1efce6c586162e3ea7256523654317e", "timestamp" "2014-06-20T17:58:07+02:00", "id" "4fec1337b1efce6c586162e3ea7256523654317e", "distinct" true}, "deleted" false, "forced" false, "after" "4fec1337b1efce6c586162e3ea7256523654317e", "commits" [{"removed" [], "added" [], "message" "Fix README\n\nSigned-off-by: chatgris <julien.boyer@af83.com>", "modified" ["README.md"], "committer" {"email" "jboyer@af83.com", "name" "chatgris", "username" "chatgris"}, "author" {"email" "jboyer@af83.com", "name" "chatgris", "username" "chatgris"}, "url" "https://github.com/AF83/funnel_http/commit/4fec1337b1efce6c586162e3ea7256523654317e", "timestamp" "2014-06-20T17:58:07+02:00", "id" "4fec1337b1efce6c586162e3ea7256523654317e", "distinct" true}], "before" "a6e82e80c30f64830ae7696ac561c038af301eeb"}}))

(triquer)
