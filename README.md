# 📅 AI習慣トラッカー - Backend

これは、ユーザーの習慣形成を支援するための**AIリマインダー付き習慣トラッカーアプリのバックエンド**です。Java + Spring Boot を使用し、初期はH2 DB、将来的にはMySQLなどで運用する設計になっています。

---

## 🚀 機能概要

- ユーザー登録／ログイン（今後追加予定）
- 習慣の作成・編集・削除
- 曜日ごとのスケジュール設定
- 習慣のチェック記録（HabitCheck）
- AIによる習慣忘れ防止リマインダー（今後追加予定）

---

## 🛠️ 技術スタック

| 分類 | 技術 |
|------|------|
| 言語 | Java 17 |
| フレームワーク | Spring Boot 3.x |
| DB | H2（開発用）／MySQL（本番用） |
| ORM | Spring Data JPA |
| ビルドツール | Gradle |
| API設計 | RESTful |
| 今後予定 | JWT認証、AI連携（Python or API）


## 🧪 開発環境での起動

```bash
./gradlew bootRun
