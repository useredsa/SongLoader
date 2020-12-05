# Song Loader

Component to load songs from an xml file with spanish tags.

## Code format plugin

[Reference]. To install a git pre-commit hook for auto formatting.

```sh
mvn git-code-format:install-hooks
```

To validate the code format

```
mvn git-code-format:validate-code-format -Dgcf.globPattern=**/*
```

To format the code.

```
mvn git-code-format:format-code -Dgcf.globPattern=**/*
```

[Reference]: https://github.com/Cosium/git-code-format-maven-plugin
