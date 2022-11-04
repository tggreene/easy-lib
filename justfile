install:
  just build
  clj -M:release install

build:
  clj -X:jar

