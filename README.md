# Spring Security SAMLサンプル
## はじめに
Spring Security
## 動作
- SAML IdPのメタデータURI登録
```
export IDP_METADATA={IdPのメタデータURI}
```

- Java側アプリ起動(default port=8080)
```
./gradlew :saml-java:bootrun
```

- Kotlin側アプリ起動(default port=8081)
```
./gradlew :saml-kt:bootrun
```


## 確認環境
- IdP: okta (trial account)

## 課題
- [saml-idp](https://github.com/mcguinness/saml-idp)をローカルで建てた時のsignification verify
  - 暗号化周りか？
- ログアウト時の挙動
- アプリ間移動した時の挙動
- SPA -> API -> Thymeleaf(SpringBootMvc) -> API -> SPA(念のため)
- IdP選定
- IdPへのユーザデータ移行
