release:
  clj -M:release

release-major:
  clj -M:release --major

release-minor:
  clj -M:release --minor

release-patch:
  clj -M:release --patch

install:
  clj -M:release install
