FROM gitpod/workspace-full

RUN brew install coursier/formulas/coursier sbt scalaenv

RUN sudo env "PATH=$PATH" coursier bootstrap org.scalameta:scalafmt-cli_2.13:2.5.3 \
  -r sonatype:snapshots \
  -o /usr/local/bin/scalafmt --standalone --main org.scalafmt.cli.Cli
