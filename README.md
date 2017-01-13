# デバッグ練習用コード
- ReadCSVFileクラスを実行しよう。エラーが出るはずだ。
  - コード概要
    - CSVファイル（data/daily_access.csv）が用意されている。1列目は日付。2列目はアクセス数（integer）を想定。
    - 上記ファイルを1行ずつ読み込み、String.split(",")でカンマ区切りの分割する。
    - 分割した1つ目（日付）をString型として保存。2つ目（アクセス数）をInteger.parseInt()でinteger型に変換して保存。
