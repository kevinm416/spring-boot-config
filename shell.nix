{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.nodejs
    pkgs.openjdk17_headless
    pkgs.jetbrains.idea-community
  ];
}


